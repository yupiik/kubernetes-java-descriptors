package io.yupiik.kubernetes.bindings.v1_30_9.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import io.yupiik.kubernetes.bindings.v1_30_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesStringSlice implements Validable<NamedResourcesStringSlice>, Exportable {
    private List<String> strings;

    public NamedResourcesStringSlice() {
        // no-op
    }

    public NamedResourcesStringSlice(final List<String> strings) {
        this.strings = strings;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(final List<String> strings) {
        this.strings = strings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strings);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesStringSlice)) {
            return false;
        }
        final NamedResourcesStringSlice __otherCasted = (NamedResourcesStringSlice) __other;
        return Objects.equals(strings, __otherCasted.strings);
    }

    public NamedResourcesStringSlice strings(final List<String> strings) {
        this.strings = strings;
        return this;
    }

    @Override
    public NamedResourcesStringSlice validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (strings == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "strings", "strings",
                "Missing 'strings' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (strings != null ? "\"strings\":" + strings.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
