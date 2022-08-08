package io.yupiik.kubernetes.bindings.v1_12_8.v1;

import io.yupiik.kubernetes.bindings.v1_12_8.Validable;
import io.yupiik.kubernetes.bindings.v1_12_8.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectAccessReviewSpec implements Validable<SubjectAccessReviewSpec> {
    private JsonObject extra;
    private List<String> groups;
    private NonResourceAttributes nonResourceAttributes;
    private ResourceAttributes resourceAttributes;
    private String uid;
    private String user;

    public SubjectAccessReviewSpec() {
        // no-op
    }

    public SubjectAccessReviewSpec(final JsonObject extra,
                                   final List<String> groups,
                                   final NonResourceAttributes nonResourceAttributes,
                                   final ResourceAttributes resourceAttributes,
                                   final String uid,
                                   final String user) {
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

    public NonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    public void setNonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    public ResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    public void setResourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                extra,
                groups,
                nonResourceAttributes,
                resourceAttributes,
                uid,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SubjectAccessReviewSpec)) {
            return false;
        }
        final SubjectAccessReviewSpec __otherCasted = (SubjectAccessReviewSpec) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(nonResourceAttributes, __otherCasted.nonResourceAttributes) &&
            Objects.equals(resourceAttributes, __otherCasted.resourceAttributes) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(user, __otherCasted.user);
    }

    public SubjectAccessReviewSpec extra(final JsonObject extra) {
        this.extra = extra;
        return this;
    }

    public SubjectAccessReviewSpec groups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

    public SubjectAccessReviewSpec nonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public SubjectAccessReviewSpec resourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    public SubjectAccessReviewSpec uid(final String uid) {
        this.uid = uid;
        return this;
    }

    public SubjectAccessReviewSpec user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public SubjectAccessReviewSpec validate() {
        return this;
    }
}
