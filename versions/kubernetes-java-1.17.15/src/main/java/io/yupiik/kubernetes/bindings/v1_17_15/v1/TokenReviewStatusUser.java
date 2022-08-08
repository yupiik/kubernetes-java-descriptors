package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;

public class TokenReviewStatusUser {
    private JsonObject extra;
    private List<String> groups;
    private String uid;
    private String username;

    public TokenReviewStatusUser() {
        // no-op
    }

    public TokenReviewStatusUser(final JsonObject extra,
                                 final List<String> groups,
                                 final String uid,
                                 final String username) {
        // no-op
    }

    public JsonObject getExtra() {
        return extra;
    }

    public void setExtra(final JsonObject extra) {
        this.extra = extra;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(final List<String> groups) {
        this.groups = groups;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                extra,
                groups,
                uid,
                username);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenReviewStatusUser)) {
            return false;
        }
        final TokenReviewStatusUser __otherCasted = (TokenReviewStatusUser) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(username, __otherCasted.username);
    }
}
