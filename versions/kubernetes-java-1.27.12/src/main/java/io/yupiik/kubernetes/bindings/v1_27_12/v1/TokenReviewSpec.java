package io.yupiik.kubernetes.bindings.v1_27_12.v1;

import io.yupiik.kubernetes.bindings.v1_27_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_12.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenReviewSpec implements Validable<TokenReviewSpec>, Exportable {
    private List<String> audiences;
    private String token;

    public TokenReviewSpec() {
        // no-op
    }

    public TokenReviewSpec(final List<String> audiences,
                           final String token) {
        this.audiences = audiences;
        this.token = token;
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                token);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewSpec)) {
            return false;
        }
        final TokenReviewSpec __otherCasted = (TokenReviewSpec) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(token, __otherCasted.token);
    }

    public TokenReviewSpec audiences(final List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenReviewSpec token(final String token) {
        this.token = token;
        return this;
    }

    @Override
    public TokenReviewSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (audiences != null ? "\"audiences\":" + audiences.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (token != null ? "\"token\":\"" +  JsonStrings.escapeJson(token) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
