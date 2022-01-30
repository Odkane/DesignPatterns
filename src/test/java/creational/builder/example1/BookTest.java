package creational.builder.example1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookTest {

    @Test
    void should_verify_all_field() {
        var actual = Book.builder()
                .name("The Last")
                .author("Gemini")
                .yearOfPublication(2020)
                .editor("Samstag")
                .build();

        assertThat(actual.getName()).isEqualTo("The Last");
        assertThat(actual.getAuthor()).isEqualTo("Gemini");
        assertThat(actual.getYearOfPublication()).isEqualTo(2020);
        assertThat(actual.getEditor()).isEqualTo("Samstag");
    }

    @Test
    void should_check_book_with_fields_not_set() {
        var actual = Book.builder()
                .name("The Last")
                .author("Gemini")
                .editor("Samstag")
                .build();

        assertThat(actual.getName()).isEqualTo("The Last");
        assertThat(actual.getAuthor()).isEqualTo("Gemini");
        assertThat(actual.getYearOfPublication()).isZero();
        assertThat(actual.getEditor()).isEqualTo("Samstag");
    }

    @Test
    void should_check_book_if_default_editor_is_set() {
        var actual = Book.builder()
                .name("The Last")
                .author("Gemini")
                .yearOfPublication(2020)
                .build();

        assertThat(actual.getName()).isEqualTo("The Last");
        assertThat(actual.getAuthor()).isEqualTo("Gemini");
        assertThat(actual.getYearOfPublication()).isEqualTo(2020);
        assertThat(actual.getEditor()).isNotNull();
        assertThat(actual.getEditor()).isEqualTo("Corona");
    }

}