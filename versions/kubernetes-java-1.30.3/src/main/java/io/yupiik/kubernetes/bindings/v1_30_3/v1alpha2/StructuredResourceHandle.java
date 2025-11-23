package io.yupiik.kubernetes.bindings.v1_30_3.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_3.Validable;
import io.yupiik.kubernetes.bindings.v1_30_3.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StructuredResourceHandle implements Validable<StructuredResourceHandle>, Exportable {
    private String nodeName;
    private List<DriverAllocationResult> results;
    private JsonObject vendorClaimParameters;
    private JsonObject vendorClassParameters;

    public StructuredResourceHandle() {
        // no-op
    }

    public StructuredResourceHandle(final String nodeName,
                                    final List<DriverAllocationResult> results,
                                    final JsonObject vendorClaimParameters,
                                    final JsonObject vendorClassParameters) {
        this.nodeName = nodeName;
        this.results = results;
        this.vendorClaimParameters = vendorClaimParameters;
        this.vendorClassParameters = vendorClassParameters;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public List<DriverAllocationResult> getResults() {
        return results;
    }

    public void setResults(final List<DriverAllocationResult> results) {
        this.results = results;
    }

    public JsonObject getVendorClaimParameters() {
        return vendorClaimParameters;
    }

    public void setVendorClaimParameters(final JsonObject vendorClaimParameters) {
        this.vendorClaimParameters = vendorClaimParameters;
    }

    public JsonObject getVendorClassParameters() {
        return vendorClassParameters;
    }

    public void setVendorClassParameters(final JsonObject vendorClassParameters) {
        this.vendorClassParameters = vendorClassParameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeName,
                results,
                vendorClaimParameters,
                vendorClassParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StructuredResourceHandle)) {
            return false;
        }
        final StructuredResourceHandle __otherCasted = (StructuredResourceHandle) __other;
        return Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(results, __otherCasted.results) &&
            Objects.equals(vendorClaimParameters, __otherCasted.vendorClaimParameters) &&
            Objects.equals(vendorClassParameters, __otherCasted.vendorClassParameters);
    }

    public StructuredResourceHandle nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public StructuredResourceHandle results(final List<DriverAllocationResult> results) {
        this.results = results;
        return this;
    }

    public StructuredResourceHandle vendorClaimParameters(final JsonObject vendorClaimParameters) {
        this.vendorClaimParameters = vendorClaimParameters;
        return this;
    }

    public StructuredResourceHandle vendorClassParameters(final JsonObject vendorClassParameters) {
        this.vendorClassParameters = vendorClassParameters;
        return this;
    }

    @Override
    public StructuredResourceHandle validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (results == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "results", "results",
                "Missing 'results' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (results != null ? "\"results\":" + results.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (vendorClaimParameters != null ? "\"vendorClaimParameters\":" + vendorClaimParameters : ""),
                    (vendorClassParameters != null ? "\"vendorClassParameters\":" + vendorClassParameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
