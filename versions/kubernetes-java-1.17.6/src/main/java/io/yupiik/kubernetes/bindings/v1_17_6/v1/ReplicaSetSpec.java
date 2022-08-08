package io.yupiik.kubernetes.bindings.v1_17_6.v1;

import io.yupiik.kubernetes.bindings.v1_17_6.Validable;
import io.yupiik.kubernetes.bindings.v1_17_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReplicaSetSpec implements Validable<ReplicaSetSpec> {
    private Integer minReadySeconds;
    private Integer replicas;
    private LabelSelector selector;
    private PodTemplateSpec template;

    public ReplicaSetSpec() {
        // no-op
    }

    public ReplicaSetSpec(final Integer minReadySeconds,
                          final Integer replicas,
                          final LabelSelector selector,
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
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
        if (!(__other instanceof ReplicaSetSpec)) {
            return false;
        }
        final ReplicaSetSpec __otherCasted = (ReplicaSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }

    public ReplicaSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public ReplicaSetSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public ReplicaSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public ReplicaSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    @Override
    public ReplicaSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
