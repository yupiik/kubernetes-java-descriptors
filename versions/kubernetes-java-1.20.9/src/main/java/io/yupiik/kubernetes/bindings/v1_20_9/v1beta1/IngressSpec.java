package io.yupiik.kubernetes.bindings.v1_20_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_9.Validable;
import io.yupiik.kubernetes.bindings.v1_20_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressSpec implements Validable<IngressSpec>, Exportable {
    private IngressBackend backend;
    private String ingressClassName;
    private List<IngressRule> rules;
    private List<IngressTLS> tls;

    public IngressSpec() {
        // no-op
    }

    public IngressSpec(final IngressBackend backend,
                       final String ingressClassName,
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
                backend,
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
        return Objects.equals(backend, __otherCasted.backend) &&
            Objects.equals(ingressClassName, __otherCasted.ingressClassName) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(tls, __otherCasted.tls);
    }

    public IngressSpec backend(final IngressBackend backend) {
        this.backend = backend;
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
                    (backend != null ? "\"backend\":" + backend.asJson() : ""),
                    (ingressClassName != null ? "\"ingressClassName\":\"" +  JsonStrings.escapeJson(ingressClassName) + "\"" : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (tls != null ? "\"tls\":" + tls.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
