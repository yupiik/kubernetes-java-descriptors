package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.List;
import java.util.Objects;

public class FlowSchemaSpecRulesNonResourceRules {
    private List<String> nonResourceURLs;
    private List<String> verbs;

    public FlowSchemaSpecRulesNonResourceRules() {
        // no-op
    }

    public FlowSchemaSpecRulesNonResourceRules(final List<String> nonResourceURLs,
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
        if (!(__other instanceof FlowSchemaSpecRulesNonResourceRules)) {
            return false;
        }
        final FlowSchemaSpecRulesNonResourceRules __otherCasted = (FlowSchemaSpecRulesNonResourceRules) __other;
        return Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }
}
