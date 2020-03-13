/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author admin
 */
public class AnalysisHelper {

    // find user with Most Likes
    // TODO
    public void userWithMostLikes() {
        System.out.println("--------------------------------------------------------------------------------------------------");
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();

        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }

        System.out.println("User with most likes:-" + max + "\n" + users.get(maxId));

    }

    // find 5 comments which have the most likes
    // TODO
    public void getFiveMostLikedComment() {
        System.out.println("--------------------------------------------------------------------------------------------------");
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());

        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();

            }
        });
        System.out.println("5 most liked comments:");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }

    public void averageNumberOfLikesPerComment() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int total = 0, i = 0;

        for (Comment c : commentList) {
            total += c.getLikes();
            i++;
        }
        System.out.println("Total number of likes:- " + total);
        System.out.println("Total number of comments:-" + i);
        System.out.println("Average number of likes per comment is:- " + total / i);

    }

    public void postWithMostComments() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Integer> commentCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        for (Comment c : comments.values()) {

            int count = 0;
            if (commentCount.containsKey(c.getPostId())) {
                count = commentCount.get(c.getPostId());
            }
            count += 1;
            commentCount.put(c.getPostId(), count);
        }
        //System.out.println(commentCount);

        int max = 0;
        int maxId = 0;
        for (int id : commentCount.keySet()) {
            if (commentCount.get(id) > max) {
                max = commentCount.get(id);
                maxId = id;
            }
        }
        System.out.println("Post with most comments is postID:-" + maxId + " with total comments:-" + "" + max + "\n");
    }

    public void postWithMostLikedComments() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> postLikesCount = new HashMap<>();
        for (Post post : posts.values()) {
            //System.out.println(post.getComments());
            for (Comment c : post.getComments()) {
                int likes = 0;
                if (postLikesCount.containsKey(post.getPostId())) {
                    likes = postLikesCount.get(post.getPostId());
                }
                likes += c.getLikes();
                postLikesCount.put(post.getPostId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : postLikesCount.keySet()) {
            if (postLikesCount.get(id) > max) {
                max = postLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("\nPost with most liked comments: " + posts.get(maxId));
        System.out.println("Count of likes: " + max + "\n");

        for (Post post : posts.values()) {
            if (post.getPostId() == maxId) {
                for (Comment c : post.getComments()) {
                    System.out.println("Comment " + c.getId() + " with " + c.getLikes() + " likes");
                }
            }
        }
    }

    public void fiveInactiveUsersBasedOnPosts() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Integer> postCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int count = 0, temp = 0;
        for (Post p : posts.values()) {
            //System.out.println(p.getUserId()+"   "+ p.getPostId());
            count++;
            if (postCount.containsKey(p.getUserId())) {
                temp = postCount.get(p.getUserId());
                count += temp;
            }

            postCount.put(p.getUserId(), count);
            //System.out.println(postCount+"\n");
            count = 0;
        }

        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(postCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });

//        System.out.println(postCount);
//        System.out.println(list);
        System.out.println("5 most inactive users based on posts:");
        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println("User ID:-" + list.get(i).getKey() + " with Number of posts :-" + list.get(i).getValue());
        }
    }

    public void fiveInactiveUsersBasedOnTotalComments() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Integer> commentCount = new HashMap<>();

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int count = 0, temp = 0;
        for (Comment c : comments.values()) {

            count++;
            if (commentCount.containsKey(c.getUserId())) {
                temp = commentCount.get(c.getUserId());
                count += temp;
            }

            commentCount.put(c.getUserId(), count);
            count = 0;
        }
        //System.out.println(commentCount);

        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(commentCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });

        //System.out.println(commentCount);
        //System.out.println(list);
        System.out.println("5 most inactive users based on comments:");
        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println("User ID:-" + list.get(i).getKey() + " with Number of comments :-" + list.get(i).getValue());
        }

    }

    public void fiveInactiveUsersOverall() {
        //Map of Total Likes
        System.out.println("--------------------------------------------------------------------------------------------------");

        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();

        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }

        }
     //System.out.println(userLikesCount);

        //Map of Total Comments
        Map<Integer, Integer> commentCount = new HashMap<>();

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int count = 0, temp = 0;
        for (Comment c : comments.values()) {

            count++;
            if (commentCount.containsKey(c.getUserId())) {
                temp = commentCount.get(c.getUserId());
                count += temp;
            }

            commentCount.put(c.getUserId(), count);
            count = 0;
        }
        //System.out.println(commentCount);

        //Map of Total Posts
        Map<Integer, Integer> postCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int counts = 0, temps = 0;
        for (Post p : posts.values()) {
            //System.out.println(p.getUserId()+"   "+ p.getPostId());
            counts++;
            if (postCount.containsKey(p.getUserId())) {
                temp = postCount.get(p.getUserId());
                counts += temps;
            }

            postCount.put(p.getUserId(), counts);
            counts = 0;
        }

        //System.out.println(postCount);
        //m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));
        //commentCount.forEach(k, counts) -> userLikesCount.merge(k, counts, Integer::sum);
        //commentCount.forEach((k,v) -> userLikesCount.merge(k, v, Integer::sum));
        //Add Likes and Comments
        Set<Integer> likeComment = new HashSet<Integer>();
        likeComment.addAll(userLikesCount.keySet());
        likeComment.addAll(commentCount.keySet());

        Map<Integer, Integer> likeCommentSum = new HashMap<Integer, Integer>();
        Integer val1, val2;
        for (Integer key : likeComment) {
            val1 = userLikesCount.get(key);
            val1 = (val1 == null ? 0 : val1);
            val2 = commentCount.get(key);
            val2 = (val2 == null ? 0 : val2);
            likeCommentSum.put(key, val1 + val2);
        }

        //System.out.println(likeCommentSum);
        //Add Posts to Likes&Comments
        Set<Integer> likeCommentPost = new HashSet<Integer>();
        likeCommentPost.addAll(likeCommentSum.keySet());
        likeCommentPost.addAll(postCount.keySet());

        Map<Integer, Integer> likeCommentPostSum = new HashMap<Integer, Integer>();
        Integer val3, val4;
        for (Integer key : likeComment) {
            val3 = likeCommentSum.get(key);
            val3 = (val3 == null ? 0 : val3);
            val4 = postCount.get(key);
            val4 = (val4 == null ? 0 : val4);
            likeCommentPostSum.put(key, val3 + val4);
        }

        //System.out.println(likeCommentPostSum);
        //Sorting and finding 5 values
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(likeCommentPostSum.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });

        //System.out.println(likeCommentPostSum);
        System.out.println("5 most inactive users based on overall posts, likes and comments:");
        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println("User ID:-" + list.get(i).getKey() + " with Total sum of posts,likes,comments equal to :-" + list.get(i).getValue());
        }
    }

    public void fiveProactiveUsersOverall() {
        System.out.println("--------------------------------------------------------------------------------------------------");

        //Map of Total Likes
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();

        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }

        }
     //System.out.println(userLikesCount);

        //Map of Total Comments
        Map<Integer, Integer> commentCount = new HashMap<>();

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int count = 0, temp = 0;
        for (Comment c : comments.values()) {

            count++;
            if (commentCount.containsKey(c.getUserId())) {
                temp = commentCount.get(c.getUserId());
                count += temp;
            }

            commentCount.put(c.getUserId(), count);
            count = 0;
        }
        //System.out.println(commentCount);

        //Map of Total Posts
        Map<Integer, Integer> postCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int counts = 0, temps = 0;
        for (Post p : posts.values()) {
            //System.out.println(p.getUserId()+"   "+ p.getPostId());
            counts++;
            if (postCount.containsKey(p.getUserId())) {
                temp = postCount.get(p.getUserId());
                counts += temps;
            }

            postCount.put(p.getUserId(), counts);
            counts = 0;
        }

        //System.out.println(postCount);
        //m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));
        //commentCount.forEach(k, counts) -> userLikesCount.merge(k, counts, Integer::sum);
        //commentCount.forEach((k,v) -> userLikesCount.merge(k, v, Integer::sum));
        //Add Likes and Comments
        Set<Integer> likeComment = new HashSet<Integer>();
        likeComment.addAll(userLikesCount.keySet());
        likeComment.addAll(commentCount.keySet());

        Map<Integer, Integer> likeCommentSum = new HashMap<Integer, Integer>();
        Integer val1, val2;
        for (Integer key : likeComment) {
            val1 = userLikesCount.get(key);
            val1 = (val1 == null ? 0 : val1);
            val2 = commentCount.get(key);
            val2 = (val2 == null ? 0 : val2);
            likeCommentSum.put(key, val1 + val2);
        }

        //System.out.println(likeCommentSum);
        //Add Posts to Likes&Comments
        Set<Integer> likeCommentPost = new HashSet<Integer>();
        likeCommentPost.addAll(likeCommentSum.keySet());
        likeCommentPost.addAll(postCount.keySet());

        Map<Integer, Integer> likeCommentPostSum = new HashMap<Integer, Integer>();
        Integer val3, val4;
        for (Integer key : likeComment) {
            val3 = likeCommentSum.get(key);
            val3 = (val3 == null ? 0 : val3);
            val4 = postCount.get(key);
            val4 = (val4 == null ? 0 : val4);
            likeCommentPostSum.put(key, val3 + val4);
        }

        //System.out.println(likeCommentPostSum);
        //Sorting and finding 5 values
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(likeCommentPostSum.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }

        });

        //System.out.println(likeCommentPostSum);
        System.out.println("5 most Proactive users based on overall posts, likes and comments:");
        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println("User ID:-" + list.get(i).getKey() + " with Total sum of posts,likes,comments equal to :-" + list.get(i).getValue());
        }
    }

}
