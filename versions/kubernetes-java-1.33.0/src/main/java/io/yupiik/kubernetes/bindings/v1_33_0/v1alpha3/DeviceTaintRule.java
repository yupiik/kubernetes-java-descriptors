package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceTaintRule implements Validable<DeviceTaintRule>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private DeviceTaintRuleSpec spec;

    public DeviceTaintRule() {
        // no-op
    }

    public DeviceTaintRule(final String apiVersion,
                           final String kind,
                           final ObjectMeta metadata,
                           final DeviceTaintRuleSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public DeviceTaintRuleSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeviceTaintRuleSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceTaintRule)) {
            return false;
        }
        final DeviceTaintRule __otherCasted = (DeviceTaintRule) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public DeviceTaintRule apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DeviceTaintRule kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DeviceTaintRule metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public DeviceTaintRule spec(final DeviceTaintRuleSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public DeviceTaintRule validate() {
        if (kind == null) {
            kind = "DeviceTaintRule";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha3";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
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
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
