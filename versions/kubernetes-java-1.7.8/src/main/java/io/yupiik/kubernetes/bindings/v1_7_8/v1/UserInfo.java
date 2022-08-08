package io.yupiik.kubernetes.bindings.v1_7_8.v1;

import io.yupiik.kubernetes.bindings.v1_7_8.Validable;
import io.yupiik.kubernetes.bindings.v1_7_8.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserInfo implements Validable<UserInfo> {
    private JsonObject extra;
    private List<String> groups;
    private String uid;
    private String username;

    public UserInfo() {
        // no-op
    }

    public UserInfo(final JsonObject extra,
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
        if (!(__other instanceof UserInfo)) {
            return false;
        }
        final UserInfo __otherCasted = (UserInfo) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(username, __otherCasted.username);
    }

    public UserInfo extra(final JsonObject extra) {
        this.extra = extra;
        return this;
    }

    public UserInfo groups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

    public UserInfo uid(final String uid) {
        this.uid = uid;
        return this;
    }

    public UserInfo username(final String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserInfo validate() {
        return this;
    }
}
