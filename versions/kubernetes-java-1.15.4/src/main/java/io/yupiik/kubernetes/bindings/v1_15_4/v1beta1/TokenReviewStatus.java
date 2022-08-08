package io.yupiik.kubernetes.bindings.v1_15_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_4.Validable;
import io.yupiik.kubernetes.bindings.v1_15_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TokenReviewStatus implements Validable<TokenReviewStatus> {
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
        // no-op
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
}