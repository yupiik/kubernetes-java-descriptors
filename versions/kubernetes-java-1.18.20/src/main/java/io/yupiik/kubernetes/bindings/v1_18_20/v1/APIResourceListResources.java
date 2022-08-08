package io.yupiik.kubernetes.bindings.v1_18_20.v1;

import java.util.List;
import java.util.Objects;

public class APIResourceListResources {
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

    public APIResourceListResources() {
        // no-op
    }

    public APIResourceListResources(final List<String> categories,
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
        if (!(__other instanceof APIResourceListResources)) {
            return false;
        }
        final APIResourceListResources __otherCasted = (APIResourceListResources) __other;
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
}
