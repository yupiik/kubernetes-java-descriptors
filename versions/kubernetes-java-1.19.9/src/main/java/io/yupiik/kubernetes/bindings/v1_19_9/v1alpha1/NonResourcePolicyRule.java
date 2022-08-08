package io.yupiik.kubernetes.bindings.v1_19_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_9.Validable;
import io.yupiik.kubernetes.bindings.v1_19_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonResourcePolicyRule implements Validable<NonResourcePolicyRule> {
    private List<String> nonResourceURLs;
    private List<String> verbs;

    public NonResourcePolicyRule() {
        // no-op
    }

    public NonResourcePolicyRule(final List<String> nonResourceURLs,
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
        if (!(__other instanceof NonResourcePolicyRule)) {
            return false;
        }
        final NonResourcePolicyRule __otherCasted = (NonResourcePolicyRule) __other;
        return Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public NonResourcePolicyRule nonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public NonResourcePolicyRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public NonResourcePolicyRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (nonResourceURLs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nonResourceURLs", "nonResourceURLs",
                "Missing 'nonResourceURLs' attribute.", true));
        }
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
