package io.yupiik.kubernetes.bindings.v1_9_8.v1;

import io.yupiik.kubernetes.bindings.v1_9_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_8.Validable;
import io.yupiik.kubernetes.bindings.v1_9_8.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceRequirements implements Validable<ResourceRequirements>, Exportable {
    private JsonObject limits;
    private JsonObject requests;

    public ResourceRequirements() {
        // no-op
    }

    public ResourceRequirements(final JsonObject limits,
                                final JsonObject requests) {
        // no-op
    }

    public JsonObject getLimits() {
        return limits;
    }

    public void setLimits(final JsonObject limits) {
        this.limits = limits;
    }

    public JsonObject getRequests() {
        return requests;
    }

    public void setRequests(final JsonObject requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceRequirements)) {
            return false;
        }
        final ResourceRequirements __otherCasted = (ResourceRequirements) __other;
        return Objects.equals(limits, __otherCasted.limits) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public ResourceRequirements limits(final JsonObject limits) {
        this.limits = limits;
        return this;
    }

    public ResourceRequirements requests(final JsonObject requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public ResourceRequirements validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (limits != null ? "\"limits\":" + limits : ""),
                    (requests != null ? "\"requests\":" + requests : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}