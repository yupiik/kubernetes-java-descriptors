package io.yupiik.kubernetes.bindings.v1_11_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_10.Validable;
import io.yupiik.kubernetes.bindings.v1_11_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeploymentRollback implements Validable<DeploymentRollback>, Exportable {
    private String apiVersion;
    private String kind;
    private String name;
    private RollbackConfig rollbackTo;
    private Map<String, String> updatedAnnotations;

    public DeploymentRollback() {
        // no-op
    }

    public DeploymentRollback(final String apiVersion,
                              final String kind,
                              final String name,
                              final RollbackConfig rollbackTo,
                              final Map<String, String> updatedAnnotations) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public RollbackConfig getRollbackTo() {
        return rollbackTo;
    }

    public void setRollbackTo(final RollbackConfig rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    public Map<String, String> getUpdatedAnnotations() {
        return updatedAnnotations;
    }

    public void setUpdatedAnnotations(final Map<String, String> updatedAnnotations) {
        this.updatedAnnotations = updatedAnnotations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name,
                rollbackTo,
                updatedAnnotations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentRollback)) {
            return false;
        }
        final DeploymentRollback __otherCasted = (DeploymentRollback) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(rollbackTo, __otherCasted.rollbackTo) &&
            Objects.equals(updatedAnnotations, __otherCasted.updatedAnnotations);
    }

    public DeploymentRollback apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DeploymentRollback kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DeploymentRollback name(final String name) {
        this.name = name;
        return this;
    }

    public DeploymentRollback rollbackTo(final RollbackConfig rollbackTo) {
        this.rollbackTo = rollbackTo;
        return this;
    }

    public DeploymentRollback updatedAnnotations(final Map<String, String> updatedAnnotations) {
        this.updatedAnnotations = updatedAnnotations;
        return this;
    }

    @Override
    public DeploymentRollback validate() {
        if (kind == null) {
            kind = "DeploymentRollback";
        }
        if (apiVersion == null) {
            apiVersion = "apps/v1beta1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (rollbackTo == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rollbackTo", "rollbackTo",
                "Missing 'rollbackTo' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (rollbackTo != null ? "\"rollbackTo\":" + rollbackTo.asJson() : ""),
                    (updatedAnnotations != null ? "\"updatedAnnotations\":" + updatedAnnotations.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
