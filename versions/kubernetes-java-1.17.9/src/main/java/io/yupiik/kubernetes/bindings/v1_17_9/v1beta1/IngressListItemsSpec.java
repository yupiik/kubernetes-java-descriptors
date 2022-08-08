package io.yupiik.kubernetes.bindings.v1_17_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class IngressListItemsSpec {
    private IngressListItemsSpecBackend backend;
    private List<IngressListItemsSpecRules> rules;
    private List<IngressListItemsSpecTls> tls;

    public IngressListItemsSpec() {
        // no-op
    }

    public IngressListItemsSpec(final IngressListItemsSpecBackend backend,
                                final List<IngressListItemsSpecRules> rules,
                                final List<IngressListItemsSpecTls> tls) {
        // no-op
    }

    public IngressListItemsSpecBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressListItemsSpecBackend backend) {
        this.backend = backend;
    }

    public List<IngressListItemsSpecRules> getRules() {
        return rules;
    }

    public void setRules(final List<IngressListItemsSpecRules> rules) {
        this.rules = rules;
    }

    public List<IngressListItemsSpecTls> getTls() {
        return tls;
    }

    public void setTls(final List<IngressListItemsSpecTls> tls) {
        this.tls = tls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backend,
                rules,
                tls);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpec)) {
            return false;
        }
        final IngressListItemsSpec __otherCasted = (IngressListItemsSpec) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(tls, __otherCasted.tls);
    }
}
