package io.yupiik.kubernetes.bindings.v1_12_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_3.Validable;
import io.yupiik.kubernetes.bindings.v1_12_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Initializers implements Validable<Initializers>, Exportable {
    private List<Initializer> pending;
    private Status result;

    public Initializers() {
        // no-op
    }

    public Initializers(final List<Initializer> pending,
                        final Status result) {
        // no-op
    }

    public List<Initializer> getPending() {
        return pending;
    }

    public void setPending(final List<Initializer> pending) {
        this.pending = pending;
    }

    public Status getResult() {
        return result;
    }

    public void setResult(final Status result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Initializers)) {
            return false;
        }
        final Initializers __otherCasted = (Initializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }

    public Initializers pending(final List<Initializer> pending) {
        this.pending = pending;
        return this;
    }

    public Initializers result(final Status result) {
        this.result = result;
        return this;
    }

    @Override
    public Initializers validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (pending == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pending", "pending",
                "Missing 'pending' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pending != null ? "\"pending\":" + pending.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (result != null ? "\"result\":" + result.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
