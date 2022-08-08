package io.yupiik.kubernetes.bindings.v1_19_15;

import java.util.List;
import java.util.Objects;

public class IngressSpec {
    private IngressSpecDefaultBackend defaultBackend;
    private String ingressClassName;
    private List<IngressSpecRules> rules;
    private List<IngressSpecTls> tls;

    public IngressSpec() {
        // no-op
    }

    public IngressSpec(final IngressSpecDefaultBackend defaultBackend,
                       final String ingressClassName,
                       final List<IngressSpecRules> rules,
                       final List<IngressSpecTls> tls) {
        // no-op
    }

    public IngressSpecDefaultBackend getDefaultBackend() {
        return defaultBackend;
    }

    public void setDefaultBackend(final IngressSpecDefaultBackend defaultBackend) {
        this.defaultBackend = defaultBackend;
    }

    public String getIngressClassName() {
        return ingressClassName;
    }

    public void setIngressClassName(final String ingressClassName) {
        this.ingressClassName = ingressClassName;
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
                defaultBackend,
                ingressClassName,
                rules,
                tls);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressSpec)) {
            return false;
        }
        final IngressSpec __otherCasted = (IngressSpec) __other;
        return Objects.equals(defaultBackend, __otherCasted.defaultBackend) &&
            Objects.equals(ingressClassName, __otherCasted.ingressClassName) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(tls, __otherCasted.tls);
    }
}
