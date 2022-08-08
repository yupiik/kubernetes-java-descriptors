package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class LocalSubjectAccessReviewSpecNonResourceAttributes {
    private String path;
    private String verb;

    public LocalSubjectAccessReviewSpecNonResourceAttributes() {
        // no-op
    }

    public LocalSubjectAccessReviewSpecNonResourceAttributes(final String path,
                                                             final String verb) {
        // no-op
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(final String verb) {
        this.verb = verb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                verb);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LocalSubjectAccessReviewSpecNonResourceAttributes)) {
            return false;
        }
        final LocalSubjectAccessReviewSpecNonResourceAttributes __otherCasted = (LocalSubjectAccessReviewSpecNonResourceAttributes) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(verb, __otherCasted.verb);
    }
}
