package io.yupiik.kubernetes.bindings.v1_18_11.v1;

import io.yupiik.kubernetes.bindings.v1_18_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_11.Validable;
import io.yupiik.kubernetes.bindings.v1_18_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceSubresourceScale implements Validable<CustomResourceSubresourceScale>, Exportable {
    private String labelSelectorPath;
    private String specReplicasPath;
    private String statusReplicasPath;

    public CustomResourceSubresourceScale() {
        // no-op
    }

    public CustomResourceSubresourceScale(final String labelSelectorPath,
                                          final String specReplicasPath,
                                          final String statusReplicasPath) {
        // no-op
    }

    public String getLabelSelectorPath() {
        return labelSelectorPath;
    }

    public void setLabelSelectorPath(final String labelSelectorPath) {
        this.labelSelectorPath = labelSelectorPath;
    }

    public String getSpecReplicasPath() {
        return specReplicasPath;
    }

    public void setSpecReplicasPath(final String specReplicasPath) {
        this.specReplicasPath = specReplicasPath;
    }

    public String getStatusReplicasPath() {
        return statusReplicasPath;
    }

    public void setStatusReplicasPath(final String statusReplicasPath) {
        this.statusReplicasPath = statusReplicasPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelectorPath,
                specReplicasPath,
                statusReplicasPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceSubresourceScale)) {
            return false;
        }
        final CustomResourceSubresourceScale __otherCasted = (CustomResourceSubresourceScale) __other;
        return Objects.equals(labelSelectorPath, __otherCasted.labelSelectorPath) &&
            Objects.equals(specReplicasPath, __otherCasted.specReplicasPath) &&
            Objects.equals(statusReplicasPath, __otherCasted.statusReplicasPath);
    }

    public CustomResourceSubresourceScale labelSelectorPath(final String labelSelectorPath) {
        this.labelSelectorPath = labelSelectorPath;
        return this;
    }

    public CustomResourceSubresourceScale specReplicasPath(final String specReplicasPath) {
        this.specReplicasPath = specReplicasPath;
        return this;
    }

    public CustomResourceSubresourceScale statusReplicasPath(final String statusReplicasPath) {
        this.statusReplicasPath = statusReplicasPath;
        return this;
    }

    @Override
    public CustomResourceSubresourceScale validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (specReplicasPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "specReplicasPath", "specReplicasPath",
                "Missing 'specReplicasPath' attribute.", true));
        }
        if (statusReplicasPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "statusReplicasPath", "statusReplicasPath",
                "Missing 'statusReplicasPath' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (labelSelectorPath != null ? "\"labelSelectorPath\":\"" +  JsonStrings.escapeJson(labelSelectorPath) + "\"" : ""),
                    (specReplicasPath != null ? "\"specReplicasPath\":\"" +  JsonStrings.escapeJson(specReplicasPath) + "\"" : ""),
                    (statusReplicasPath != null ? "\"statusReplicasPath\":\"" +  JsonStrings.escapeJson(statusReplicasPath) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
