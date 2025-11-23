package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceRequirements implements Validable<ResourceRequirements>, Exportable {
    private List<ResourceClaim> claims;
    private JsonObject limits;
    private JsonObject requests;

    public ResourceRequirements() {
        // no-op
    }

    public ResourceRequirements(final List<ResourceClaim> claims,
                                final JsonObject limits,
                                final JsonObject requests) {
        this.claims = claims;
        this.limits = limits;
        this.requests = requests;
    }

    public List<ResourceClaim> getClaims() {
        return claims;
    }

    public void setClaims(final List<ResourceClaim> claims) {
        this.claims = claims;
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
                claims,
                limits,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceRequirements)) {
            return false;
        }
        final ResourceRequirements __otherCasted = (ResourceRequirements) __other;
        return Objects.equals(claims, __otherCasted.claims) &&
            Objects.equals(limits, __otherCasted.limits) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public ResourceRequirements claims(final List<ResourceClaim> claims) {
        this.claims = claims;
        return this;
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
                    (claims != null ? "\"claims\":" + claims.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (limits != null ? "\"limits\":" + limits : ""),
                    (requests != null ? "\"requests\":" + requests : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
