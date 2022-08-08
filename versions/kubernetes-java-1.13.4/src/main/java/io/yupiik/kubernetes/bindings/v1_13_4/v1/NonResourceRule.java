package io.yupiik.kubernetes.bindings.v1_13_4.v1;

import io.yupiik.kubernetes.bindings.v1_13_4.Validable;
import io.yupiik.kubernetes.bindings.v1_13_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonResourceRule implements Validable<NonResourceRule> {
    private List<String> nonResourceURLs;
    private List<String> verbs;

    public NonResourceRule() {
        // no-op
    }

    public NonResourceRule(final List<String> nonResourceURLs,
                           final List<String> verbs) {
        // no-op
    }

    public List<String> getNonResourceURLs() {
        return nonResourceURLs;
    }

    public void setNonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceURLs,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NonResourceRule)) {
            return false;
        }
        final NonResourceRule __otherCasted = (NonResourceRule) __other;
        return Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public NonResourceRule nonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public NonResourceRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public NonResourceRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (verbs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "verbs", "verbs",
                "Missing 'verbs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
