package io.yupiik.kubernetes.bindings.v1_27_0.v1;

import io.yupiik.kubernetes.bindings.v1_27_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_0.Validable;
import io.yupiik.kubernetes.bindings.v1_27_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NonResourceRule implements Validable<NonResourceRule>, Exportable {
    private List<String> nonResourceURLs;
    private List<String> verbs;

    public NonResourceRule() {
        // no-op
    }

    public NonResourceRule(final List<String> nonResourceURLs,
                           final List<String> verbs) {
        this.nonResourceURLs = nonResourceURLs;
        this.verbs = verbs;
    }

    public List<String> getNonResourceURLs() {
        return nonResourceURLs;
    }

    public void setNonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceURLs,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NonResourceRule)) {
            return false;
        }
        final NonResourceRule __otherCasted = (NonResourceRule) __other;
        return Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public NonResourceRule nonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public NonResourceRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public NonResourceRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (verbs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "verbs", "verbs",
                "Missing 'verbs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nonResourceURLs != null ? "\"nonResourceURLs\":" + nonResourceURLs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (verbs != null ? "\"verbs\":" + verbs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
