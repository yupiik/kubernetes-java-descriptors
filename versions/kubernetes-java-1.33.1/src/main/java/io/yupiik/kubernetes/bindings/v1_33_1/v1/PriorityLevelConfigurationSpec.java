package io.yupiik.kubernetes.bindings.v1_33_1.v1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import io.yupiik.kubernetes.bindings.v1_33_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PriorityLevelConfigurationSpec implements Validable<PriorityLevelConfigurationSpec>, Exportable {
    private ExemptPriorityLevelConfiguration exempt;
    private LimitedPriorityLevelConfiguration limited;
    private String type;

    public PriorityLevelConfigurationSpec() {
        // no-op
    }

    public PriorityLevelConfigurationSpec(final ExemptPriorityLevelConfiguration exempt,
                                          final LimitedPriorityLevelConfiguration limited,
                                          final String type) {
        this.exempt = exempt;
        this.limited = limited;
        this.type = type;
    }

    public ExemptPriorityLevelConfiguration getExempt() {
        return exempt;
    }

    public void setExempt(final ExemptPriorityLevelConfiguration exempt) {
        this.exempt = exempt;
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
                exempt,
                limited,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationSpec)) {
            return false;
        }
        final PriorityLevelConfigurationSpec __otherCasted = (PriorityLevelConfigurationSpec) __other;
        return Objects.equals(exempt, __otherCasted.exempt) &&
            Objects.equals(limited, __otherCasted.limited) &&
            Objects.equals(type, __otherCasted.type);
    }

    public PriorityLevelConfigurationSpec exempt(final ExemptPriorityLevelConfiguration exempt) {
        this.exempt = exempt;
        return this;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (exempt != null ? "\"exempt\":" + exempt.asJson() : ""),
                    (limited != null ? "\"limited\":" + limited.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
