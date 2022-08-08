package io.yupiik.kubernetes.bindings.v1_22_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import io.yupiik.kubernetes.bindings.v1_22_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PriorityLevelConfigurationSpec implements Validable<PriorityLevelConfigurationSpec> {
    private LimitedPriorityLevelConfiguration limited;
    private String type;

    public PriorityLevelConfigurationSpec() {
        // no-op
    }

    public PriorityLevelConfigurationSpec(final LimitedPriorityLevelConfiguration limited,
                                          final String type) {
        // no-op
    }

    public LimitedPriorityLevelConfiguration getLimited() {
        return limited;
    }

    public void setLimited(final LimitedPriorityLevelConfiguration limited) {
        this.limited = limited;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limited,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationSpec)) {
            return false;
        }
        final PriorityLevelConfigurationSpec __otherCasted = (PriorityLevelConfigurationSpec) __other;
        return Objects.equals(limited, __otherCasted.limited) &&
            Objects.equals(type, __otherCasted.type);
    }

    public PriorityLevelConfigurationSpec limited(final LimitedPriorityLevelConfiguration limited) {
        this.limited = limited;
        return this;
    }

    public PriorityLevelConfigurationSpec type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public PriorityLevelConfigurationSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
