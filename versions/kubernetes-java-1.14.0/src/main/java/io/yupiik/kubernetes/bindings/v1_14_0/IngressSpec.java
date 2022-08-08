package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.List;
import java.util.Objects;

public class IngressSpec {
    private IngressSpecBackend backend;
    private List<IngressSpecRules> rules;
    private List<IngressSpecTls> tls;

    public IngressSpec() {
        // no-op
    }

    public IngressSpec(final IngressSpecBackend backend,
                       final List<IngressSpecRules> rules,
                       final List<IngressSpecTls> tls) {
        // no-op
    }

    public IngressSpecBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressSpecBackend backend) {
        this.backend = backend;
    }

    public List<IngressSpecRules> getRules() {
        return rules;
    }

    public void setRules(final List<IngressSpecRules> rules) {
        this.rules = rules;
    }

    public List<IngressSpecTls> getTls() {
        return tls;
    }

    public void setTls(final List<IngressSpecTls> tls) {
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
        if (!(__other instanceof IngressSpec)) {
            return false;
        }
        final IngressSpec __otherCasted = (IngressSpec) __other;
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(tls, __otherCasted.tls);
    }
}
