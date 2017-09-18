package de.cblicous.graphql;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import de.cblicous.graphql.input.AuthorInput;

public class RootMutation implements GraphQLMutationResolver {
    private PostDao postDao;
    private AuthorDao authorDao;
    
    public RootMutation(PostDao postDao,AuthorDao authorDao) {
        this.postDao = postDao;
        this.authorDao = authorDao;
    }

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID()
            .toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postDao.savePost(post);

        return post;
    }
    
    
    public Author createAuthor(AuthorInput authorInput) {
        Author author = new Author();
        author.setName(authorInput.getName());
        author.setId(UUID.randomUUID()
            .toString());
        author.setThumbnail(authorInput.getThumbnail());
        authorDao.saveAuthor(author);
        return author;
    }
    
}