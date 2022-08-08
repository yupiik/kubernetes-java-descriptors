package io.yupiik.kubernetes.bindings.v1_18_19.v2beta2;

import io.yupiik.kubernetes.bindings.v1_18_19.Validable;
import io.yupiik.kubernetes.bindings.v1_18_19.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceMetricSource implements Validable<ResourceMetricSource> {
    private String name;
    private MetricTarget target;

    public ResourceMetricSource() {
        // no-op
    }

    public ResourceMetricSource(final String name,
                                final MetricTarget target) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public MetricTarget getTarget() {
        return target;
    }

    public void setTarget(final MetricTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceMetricSource)) {
            return false;
        }
        final ResourceMetricSource __otherCasted = (ResourceMetricSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(target, __otherCasted.target);
    }

    public ResourceMetricSource name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceMetricSource target(final MetricTarget target) {
        this.target = target;
        return this;
    }

    @Override
    public ResourceMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (target == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "target", "target",
                "Missing 'target' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
