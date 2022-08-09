package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import io.yupiik.kubernetes.bindings.v1_22_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_1.Validable;
import io.yupiik.kubernetes.bindings.v1_22_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitRange implements Validable<LimitRange>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private LimitRangeSpec spec;

    public LimitRange() {
        // no-op
    }

    public LimitRange(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
                      final LimitRangeSpec spec) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public LimitRangeSpec getSpec() {
        return spec;
    }

    public void setSpec(final LimitRangeSpec spec) {
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
        if (!(__other instanceof LimitRange)) {
            return false;
        }
        final LimitRange __otherCasted = (LimitRange) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public LimitRange apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LimitRange kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public LimitRange metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public LimitRange spec(final LimitRangeSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public LimitRange validate() {
        if (kind == null) {
            kind = "LimitRange";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
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
