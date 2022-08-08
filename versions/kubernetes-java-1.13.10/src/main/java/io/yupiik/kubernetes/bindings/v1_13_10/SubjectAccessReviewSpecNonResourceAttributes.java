package io.yupiik.kubernetes.bindings.v1_13_10;

import java.util.Objects;

public class SubjectAccessReviewSpecNonResourceAttributes {
    private String path;
    private String verb;

    public SubjectAccessReviewSpecNonResourceAttributes() {
        // no-op
    }

    public SubjectAccessReviewSpecNonResourceAttributes(final String path,
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
        if (!(__other instanceof SubjectAccessReviewSpecNonResourceAttributes)) {
            return false;
        }
        final SubjectAccessReviewSpecNonResourceAttributes __otherCasted = (SubjectAccessReviewSpecNonResourceAttributes) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(verb, __otherCasted.verb);
    }
}
