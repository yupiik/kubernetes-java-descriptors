package io.yupiik.kubernetes.bindings.v1_10_9.v1;

import io.yupiik.kubernetes.bindings.v1_10_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_9.Validable;
import io.yupiik.kubernetes.bindings.v1_10_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IPBlock implements Validable<IPBlock>, Exportable {
    private String cidr;
    private List<String> except;

    public IPBlock() {
        // no-op
    }

    public IPBlock(final String cidr,
                   final List<String> except) {
        // no-op
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(final String cidr) {
        this.cidr = cidr;
    }

    public List<String> getExcept() {
        return except;
    }

    public void setExcept(final List<String> except) {
        this.except = except;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cidr,
                except);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IPBlock)) {
            return false;
        }
        final IPBlock __otherCasted = (IPBlock) __other;
        return Objects.equals(cidr, __otherCasted.cidr) &&
            Objects.equals(except, __otherCasted.except);
    }

    public IPBlock cidr(final String cidr) {
        this.cidr = cidr;
        return this;
    }

    public IPBlock except(final List<String> except) {
        this.except = except;
        return this;
    }

    @Override
    public IPBlock validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (cidr == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "cidr", "cidr",
                "Missing 'cidr' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (cidr != null ? "\"cidr\":\"" +  JsonStrings.escapeJson(cidr) + "\"" : ""),
                    (except != null ? "\"except\":" + except.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
