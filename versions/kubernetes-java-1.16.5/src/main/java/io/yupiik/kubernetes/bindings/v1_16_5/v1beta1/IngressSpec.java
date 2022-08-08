package io.yupiik.kubernetes.bindings.v1_16_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_5.Validable;
import io.yupiik.kubernetes.bindings.v1_16_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressSpec implements Validable<IngressSpec> {
    private IngressBackend backend;
    private List<IngressRule> rules;
    private List<IngressTLS> tls;

    public IngressSpec() {
        // no-op
    }

    public IngressSpec(final IngressBackend backend,
                       final List<IngressRule> rules,
                       final List<IngressTLS> tls) {
        // no-op
    }

    public IngressBackend getBackend() {
        return backend;
    }

    public void setBackend(final IngressBackend backend) {
        this.backend = backend;
    }

    public List<IngressRule> getRules() {
        return rules;
    }

    public void setRules(final List<IngressRule> rules) {
        this.rules = rules;
    }

    public List<IngressTLS> getTls() {
        return tls;
    }

    public void setTls(final List<IngressTLS> tls) {
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

    public IngressSpec backend(final IngressBackend backend) {
        this.backend = backend;
        return this;
    }

    public IngressSpec rules(final List<IngressRule> rules) {
        this.rules = rules;
        return this;
    }

    public IngressSpec tls(final List<IngressTLS> tls) {
        this.tls = tls;
        return this;
    }

    @Override
    public IngressSpec validate() {
        return this;
    }
}
