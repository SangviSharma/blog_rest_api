package com.sangvisharma.blog_rest_api.service;
import com.sangvisharma.blog_rest_api.entity.Comment;

import java.util.List;


public interface CommentService {
    Comment createComment(Long postId, Comment comment);
    List<Comment> getCommentByPostId(Long postId);
    Comment getCommentById(Long postId, Long commentId);
    Comment updateComment(Long postId, Long commentId, Comment updateComment);
    void deleteComment(Long postId, Long commentId);
}
