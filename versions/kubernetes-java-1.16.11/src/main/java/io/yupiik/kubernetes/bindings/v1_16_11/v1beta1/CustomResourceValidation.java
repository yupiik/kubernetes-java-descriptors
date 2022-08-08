package io.yupiik.kubernetes.bindings.v1_16_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_11.Validable;
import io.yupiik.kubernetes.bindings.v1_16_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceValidation implements Validable<CustomResourceValidation> {
    private JSONSchemaProps openAPIV3Schema;

    public CustomResourceValidation() {
        // no-op
    }

    public CustomResourceValidation(final JSONSchemaProps openAPIV3Schema) {
        // no-op
    }

    public JSONSchemaProps getOpenAPIV3Schema() {
        return openAPIV3Schema;
    }

    public void setOpenAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                openAPIV3Schema);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceValidation)) {
            return false;
        }
        final CustomResourceValidation __otherCasted = (CustomResourceValidation) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }

    public CustomResourceValidation openAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
        return this;
    }

    @Override
    public CustomResourceValidation validate() {
        return this;
    }
}
