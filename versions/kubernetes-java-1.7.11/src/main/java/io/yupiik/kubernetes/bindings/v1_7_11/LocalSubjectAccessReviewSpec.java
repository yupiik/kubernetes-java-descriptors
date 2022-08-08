package io.yupiik.kubernetes.bindings.v1_7_11;

import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;

public class LocalSubjectAccessReviewSpec {
    private JsonObject extra;
    private List<String> group;
    private LocalSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes;
    private LocalSubjectAccessReviewSpecResourceAttributes resourceAttributes;
    private String user;

    public LocalSubjectAccessReviewSpec() {
        // no-op
    }

    public LocalSubjectAccessReviewSpec(final JsonObject extra,
                                        final List<String> group,
                                        final LocalSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes,
                                        final LocalSubjectAccessReviewSpecResourceAttributes resourceAttributes,
                                        final String user) {
        // no-op
    }

    public JsonObject getExtra() {
        return extra;
    }

    public void setExtra(final JsonObject extra) {
        this.extra = extra;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(final List<String> group) {
        this.group = group;
    }

    public LocalSubjectAccessReviewSpecNonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    public void setNonResourceAttributes(final LocalSubjectAccessReviewSpecNonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    public LocalSubjectAccessReviewSpecResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    public void setResourceAttributes(final LocalSubjectAccessReviewSpecResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
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
                group,
                nonResourceAttributes,
                resourceAttributes,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalSubjectAccessReviewSpec)) {
            return false;
        }
        final LocalSubjectAccessReviewSpec __otherCasted = (LocalSubjectAccessReviewSpec) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(nonResourceAttributes, __otherCasted.nonResourceAttributes) &&
            Objects.equals(resourceAttributes, __otherCasted.resourceAttributes) &&
            Objects.equals(user, __otherCasted.user);
    }
}
