package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Mutation implements Validable<Mutation>, Exportable {
    private ApplyConfiguration applyConfiguration;
    private JSONPatch jsonPatch;
    private String patchType;

    public Mutation() {
        // no-op
    }

    public Mutation(final ApplyConfiguration applyConfiguration,
                    final JSONPatch jsonPatch,
                    final String patchType) {
        this.applyConfiguration = applyConfiguration;
        this.jsonPatch = jsonPatch;
        this.patchType = patchType;
    }

    public ApplyConfiguration getApplyConfiguration() {
        return applyConfiguration;
    }

    public void setApplyConfiguration(final ApplyConfiguration applyConfiguration) {
        this.applyConfiguration = applyConfiguration;
    }

    public JSONPatch getJsonPatch() {
        return jsonPatch;
    }

    public void setJsonPatch(final JSONPatch jsonPatch) {
        this.jsonPatch = jsonPatch;
    }

    public String getPatchType() {
        return patchType;
    }

    public void setPatchType(final String patchType) {
        this.patchType = patchType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                applyConfiguration,
                jsonPatch,
                patchType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Mutation)) {
            return false;
        }
        final Mutation __otherCasted = (Mutation) __other;
        return Objects.equals(applyConfiguration, __otherCasted.applyConfiguration) &&
            Objects.equals(jsonPatch, __otherCasted.jsonPatch) &&
            Objects.equals(patchType, __otherCasted.patchType);
    }

    public Mutation applyConfiguration(final ApplyConfiguration applyConfiguration) {
        this.applyConfiguration = applyConfiguration;
        return this;
    }

    public Mutation jsonPatch(final JSONPatch jsonPatch) {
        this.jsonPatch = jsonPatch;
        return this;
    }

    public Mutation patchType(final String patchType) {
        this.patchType = patchType;
        return this;
    }

    @Override
    public Mutation validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (patchType == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "patchType", "patchType",
                "Missing 'patchType' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (applyConfiguration != null ? "\"applyConfiguration\":" + applyConfiguration.asJson() : ""),
                    (jsonPatch != null ? "\"jsonPatch\":" + jsonPatch.asJson() : ""),
                    (patchType != null ? "\"patchType\":\"" +  JsonStrings.escapeJson(patchType) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
