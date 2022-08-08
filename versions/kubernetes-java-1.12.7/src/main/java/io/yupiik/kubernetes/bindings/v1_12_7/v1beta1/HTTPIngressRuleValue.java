package io.yupiik.kubernetes.bindings.v1_12_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_7.Validable;
import io.yupiik.kubernetes.bindings.v1_12_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HTTPIngressRuleValue implements Validable<HTTPIngressRuleValue> {
    private List<HTTPIngressPath> paths;

    public HTTPIngressRuleValue() {
        // no-op
    }

    public HTTPIngressRuleValue(final List<HTTPIngressPath> paths) {
        // no-op
    }

    public List<HTTPIngressPath> getPaths() {
        return paths;
    }

    public void setPaths(final List<HTTPIngressPath> paths) {
        this.paths = paths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                paths);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPIngressRuleValue)) {
            return false;
        }
        final HTTPIngressRuleValue __otherCasted = (HTTPIngressRuleValue) __other;
        return Objects.equals(paths, __otherCasted.paths);
    }

    public HTTPIngressRuleValue paths(final List<HTTPIngressPath> paths) {
        this.paths = paths;
        return this;
    }

    @Override
    public HTTPIngressRuleValue validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (paths == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "paths", "paths",
                "Missing 'paths' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
