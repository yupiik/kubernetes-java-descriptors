package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import io.yupiik.kubernetes.bindings.v1_20_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_6.Validable;
import io.yupiik.kubernetes.bindings.v1_20_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIResource implements Validable<APIResource>, Exportable {
    private List<String> categories;
    private String group;
    private String kind;
    private String name;
    private boolean namespaced;
    private List<String> shortNames;
    private String singularName;
    private String storageVersionHash;
    private List<String> verbs;
    private String version;

    public APIResource() {
        // no-op
    }

    public APIResource(final List<String> categories,
                       final String group,
                       final String kind,
                       final String name,
                       final boolean namespaced,
                       final List<String> shortNames,
                       final String singularName,
                       final String storageVersionHash,
                       final List<String> verbs,
                       final String version) {
        // no-op
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(final List<String> categories) {
        this.categories = categories;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
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

    public boolean getNamespaced() {
        return namespaced;
    }

    public void setNamespaced(final boolean namespaced) {
        this.namespaced = namespaced;
    }

    public List<String> getShortNames() {
        return shortNames;
    }

    public void setShortNames(final List<String> shortNames) {
        this.shortNames = shortNames;
    }

    public String getSingularName() {
        return singularName;
    }

    public void setSingularName(final String singularName) {
        this.singularName = singularName;
    }

    public String getStorageVersionHash() {
        return storageVersionHash;
    }

    public void setStorageVersionHash(final String storageVersionHash) {
        this.storageVersionHash = storageVersionHash;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                categories,
                group,
                kind,
                name,
                namespaced,
                shortNames,
                singularName,
                storageVersionHash,
                verbs,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIResource)) {
            return false;
        }
        final APIResource __otherCasted = (APIResource) __other;
        return Objects.equals(categories, __otherCasted.categories) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaced, __otherCasted.namespaced) &&
            Objects.equals(shortNames, __otherCasted.shortNames) &&
            Objects.equals(singularName, __otherCasted.singularName) &&
            Objects.equals(storageVersionHash, __otherCasted.storageVersionHash) &&
            Objects.equals(verbs, __otherCasted.verbs) &&
            Objects.equals(version, __otherCasted.version);
    }

    public APIResource categories(final List<String> categories) {
        this.categories = categories;
        return this;
    }

    public APIResource group(final String group) {
        this.group = group;
        return this;
    }

    public APIResource kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIResource name(final String name) {
        this.name = name;
        return this;
    }

    public APIResource namespaced(final boolean namespaced) {
        this.namespaced = namespaced;
        return this;
    }

    public APIResource shortNames(final List<String> shortNames) {
        this.shortNames = shortNames;
        return this;
    }

    public APIResource singularName(final String singularName) {
        this.singularName = singularName;
        return this;
    }

    public APIResource storageVersionHash(final String storageVersionHash) {
        this.storageVersionHash = storageVersionHash;
        return this;
    }

    public APIResource verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    public APIResource version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public APIResource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (singularName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "singularName", "singularName",
                "Missing 'singularName' attribute.", true));
        }
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
                    (categories != null ? "\"categories\":" + categories.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    "\"namespaced\":" + namespaced,
                    (shortNames != null ? "\"shortNames\":" + shortNames.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (singularName != null ? "\"singularName\":\"" +  JsonStrings.escapeJson(singularName) + "\"" : ""),
                    (storageVersionHash != null ? "\"storageVersionHash\":\"" +  JsonStrings.escapeJson(storageVersionHash) + "\"" : ""),
                    (verbs != null ? "\"verbs\":" + verbs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
