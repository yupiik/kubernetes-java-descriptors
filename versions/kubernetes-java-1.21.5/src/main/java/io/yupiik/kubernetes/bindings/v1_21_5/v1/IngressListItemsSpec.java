package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import java.util.List;
import java.util.Objects;

public class IngressListItemsSpec {
    private IngressListItemsSpecDefaultBackend defaultBackend;
    private String ingressClassName;
    private List<IngressListItemsSpecRules> rules;
    private List<IngressListItemsSpecTls> tls;

    public IngressListItemsSpec() {
        // no-op
    }

    public IngressListItemsSpec(final IngressListItemsSpecDefaultBackend defaultBackend,
                                final String ingressClassName,
                                final List<IngressListItemsSpecRules> rules,
                                final List<IngressListItemsSpecTls> tls) {
        // no-op
    }

    public IngressListItemsSpecDefaultBackend getDefaultBackend() {
        return defaultBackend;
    }

    public void setDefaultBackend(final IngressListItemsSpecDefaultBackend defaultBackend) {
        this.defaultBackend = defaultBackend;
    }

    public String getIngressClassName() {
        return ingressClassName;
    }

    public void setIngressClassName(final String ingressClassName) {
        this.ingressClassName = ingressClassName;
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
                defaultBackend,
                ingressClassName,
                rules,
                tls);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpec)) {
            return false;
        }
        final IngressListItemsSpec __otherCasted = (IngressListItemsSpec) __other;
        return Objects.equals(defaultBackend, __otherCasted.defaultBackend) &&
            Objects.equals(ingressClassName, __otherCasted.ingressClassName) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(tls, __otherCasted.tls);
    }
}
