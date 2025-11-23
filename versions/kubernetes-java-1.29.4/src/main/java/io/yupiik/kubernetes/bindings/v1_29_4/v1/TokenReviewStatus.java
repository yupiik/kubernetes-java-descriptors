package io.yupiik.kubernetes.bindings.v1_29_4.v1;

import io.yupiik.kubernetes.bindings.v1_29_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_4.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenReviewStatus implements Validable<TokenReviewStatus>, Exportable {
    private List<String> audiences;
    private Boolean authenticated;
    private String error;
    private UserInfo user;

    public TokenReviewStatus() {
        // no-op
    }

    public TokenReviewStatus(final List<String> audiences,
                             final Boolean authenticated,
                             final String error,
                             final UserInfo user) {
        this.audiences = audiences;
        this.authenticated = authenticated;
        this.error = error;
        this.user = user;
    }

    public List<String> getAudiences() {
        return audiences;
    }

    public void setAudiences(final List<String> audiences) {
        this.audiences = audiences;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(final Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(final UserInfo user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audiences,
                authenticated,
                error,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewStatus)) {
            return false;
        }
        final TokenReviewStatus __otherCasted = (TokenReviewStatus) __other;
        return Objects.equals(audiences, __otherCasted.audiences) &&
            Objects.equals(authenticated, __otherCasted.authenticated) &&
            Objects.equals(error, __otherCasted.error) &&
            Objects.equals(user, __otherCasted.user);
    }

    public TokenReviewStatus audiences(final List<String> audiences) {
        this.audiences = audiences;
        return this;
    }

    public TokenReviewStatus authenticated(final Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }

    public TokenReviewStatus error(final String error) {
        this.error = error;
        return this;
    }

    public TokenReviewStatus user(final UserInfo user) {
        this.user = user;
        return this;
    }

    @Override
    public TokenReviewStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (audiences != null ? "\"audiences\":" + audiences.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (authenticated != null ? "\"authenticated\":" + authenticated : ""),
                    (error != null ? "\"error\":\"" +  JsonStrings.escapeJson(error) + "\"" : ""),
                    (user != null ? "\"user\":" + user.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
