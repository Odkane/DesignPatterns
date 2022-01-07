package Creational.Builder.secondWay;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void should_verify_all_field() {
        var actual = Book.builder()
                .name("The Last")
                .author("Gemini")
                .yearOfPublication(2020)
                .editor("Corona")
                .build();

        assertThat(actual.getName()).isEqualTo("The Last");
        assertThat(actual.getAuthor()).isEqualTo("Gemini");
        assertThat(actual.getYearOfPublication()).isEqualTo(2020);
        assertThat(actual.getEditor()).isEqualTo("Corona");
    }

    @Test
    void should_check_book_with_fields_not_set() {
        var actual = Book.builder()
                .name("The Last")
                .author("Gemini")
                .yearOfPublication(2020)
                .build();

        assertThat(actual.getName()).isEqualTo("The Last");
        assertThat(actual.getAuthor()).isEqualTo("Gemini");
        assertThat(actual.getYearOfPublication()).isEqualTo(2020);
        assertThat(actual.getEditor()).isNull();
    }

}