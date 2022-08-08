package io.yupiik.kubernetes.bindings.v1_19_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_3.Validable;
import io.yupiik.kubernetes.bindings.v1_19_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressRule implements Validable<IngressRule> {
    private String host;
    private HTTPIngressRuleValue http;

    public IngressRule() {
        // no-op
    }

    public IngressRule(final String host,
                       final HTTPIngressRuleValue http) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public HTTPIngressRuleValue getHttp() {
        return http;
    }

    public void setHttp(final HTTPIngressRuleValue http) {
        this.http = http;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                http);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressRule)) {
            return false;
        }
        final IngressRule __otherCasted = (IngressRule) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(http, __otherCasted.http);
    }

    public IngressRule host(final String host) {
        this.host = host;
        return this;
    }

    public IngressRule http(final HTTPIngressRuleValue http) {
        this.http = http;
        return this;
    }

    @Override
    public IngressRule validate() {
        return this;
    }
}
