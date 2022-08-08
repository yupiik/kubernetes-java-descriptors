package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import io.yupiik.kubernetes.bindings.v1_17_15.Validable;
import io.yupiik.kubernetes.bindings.v1_17_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReplicationControllerSpec implements Validable<ReplicationControllerSpec> {
    private Integer minReadySeconds;
    private Integer replicas;
    private Map<String, String> selector;
    private PodTemplateSpec template;

    public ReplicationControllerSpec() {
        // no-op
    }

    public ReplicationControllerSpec(final Integer minReadySeconds,
                                     final Integer replicas,
                                     final Map<String, String> selector,
                                     final PodTemplateSpec template) {
        // no-op
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(final Map<String, String> selector) {
        this.selector = selector;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                replicas,
                selector,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpec)) {
            return false;
        }
        final ReplicationControllerSpec __otherCasted = (ReplicationControllerSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }

    public ReplicationControllerSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public ReplicationControllerSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public ReplicationControllerSpec selector(final Map<String, String> selector) {
        this.selector = selector;
        return this;
    }

    public ReplicationControllerSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    @Override
    public ReplicationControllerSpec validate() {
        return this;
    }
}
