package creational.simplefactory;

import org.junit.jupiter.api.Test;

import static creational.simplefactory.PostFactory.createPost;
import static creational.simplefactory.PostType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SimpleFactoryTest {

    @Test
    void should_verify_instance_of_generated_post_subclasses() {

        assertThat(createPost(BLOG)).isInstanceOf(BlogPost.class);
        assertThat(createPost(NEWS)).isInstanceOf(NewsPost.class);
        assertThat(createPost(PRODUCT)).isInstanceOf(ProductPost.class);
    }

    @Test
    void should_throw_an_exception_when_post_type_is_unknown() {

        assertThatThrownBy(() -> createPost(PostType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");
    }

}