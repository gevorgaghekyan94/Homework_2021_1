package com.company;

public class Product {

    private int upvote = 0;
    private int downvote = 0;

    public Product() {
    }

    public Product(int upvote, int downvote) {
        this.upvote = upvote;
        this.downvote = downvote;
    }

    public static void addUpvote(Product product) {
        product.upvote++;
    }

    public static void addDownvote(Product product) {
        product.downvote++;
    }

    public static void getVoteCount(Product product) {
        System.out.println("({ upvotes: " + product.upvote + " , " + "downvotes: " + product.downvote + " }) -> "
                + (product.upvote - product.downvote));
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDownvote() {
        return downvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }
}
