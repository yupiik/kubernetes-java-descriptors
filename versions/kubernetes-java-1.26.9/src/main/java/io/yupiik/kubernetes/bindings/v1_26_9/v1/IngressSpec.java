package io.yupiik.kubernetes.bindings.v1_26_9.v1;

import io.yupiik.kubernetes.bindings.v1_26_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_9.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressSpec implements Validable<IngressSpec>, Exportable {
    private IngressBackend defaultBackend;
    private String ingressClassName;
    private List<IngressRule> rules;
    private List<IngressTLS> tls;

    public IngressSpec() {
        // no-op
    }

    public IngressSpec(final IngressBackend defaultBackend,
                       final String ingressClassName,
                       final List<IngressRule> rules,
                       final List<IngressTLS> tls) {
        this.defaultBackend = defaultBackend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    public IngressBackend getDefaultBackend() {
        return defaultBackend;
    }

    public void setDefaultBackend(final IngressBackend defaultBackend) {
        this.defaultBackend = defaultBackend;
    }

    public String getIngressClassName() {
        return ingressClassName;
    }

    public void setIngressClassName(final String ingressClassName) {
        this.ingressClassName = ingressClassName;
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

    public IngressSpec defaultBackend(final IngressBackend defaultBackend) {
        this.defaultBackend = defaultBackend;
        return this;
    }

    public IngressSpec ingressClassName(final String ingressClassName) {
        this.ingressClassName = ingressClassName;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultBackend != null ? "\"defaultBackend\":" + defaultBackend.asJson() : ""),
                    (ingressClassName != null ? "\"ingressClassName\":\"" +  JsonStrings.escapeJson(ingressClassName) + "\"" : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (tls != null ? "\"tls\":" + tls.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
