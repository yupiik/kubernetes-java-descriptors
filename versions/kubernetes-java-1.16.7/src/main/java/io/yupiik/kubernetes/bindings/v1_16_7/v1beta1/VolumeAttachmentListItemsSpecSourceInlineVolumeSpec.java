package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpec {
    private List<String> accessModes;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureDisk azureDisk;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureFile azureFile;
    private Map<String, String> capacity;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCephfs cephfs;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCinder cinder;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecClaimRef claimRef;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCsi csi;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFc fc;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume flexVolume;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlocker flocker;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGlusterfs glusterfs;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath hostPath;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecIscsi iscsi;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecLocal local;
    private List<String> mountOptions;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNfs nfs;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPortworxVolume portworxVolume;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecQuobyte quobyte;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecRbd rbd;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecScaleIO scaleIO;
    private String storageClassName;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecStorageos storageos;
    private String volumeMode;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpec() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpec(final List<String> accessModes,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureDisk azureDisk,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureFile azureFile,
                                                               final Map<String, String> capacity,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCephfs cephfs,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCinder cinder,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecClaimRef claimRef,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCsi csi,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFc fc,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume flexVolume,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlocker flocker,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGlusterfs glusterfs,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath hostPath,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecIscsi iscsi,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecLocal local,
                                                               final List<String> mountOptions,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNfs nfs,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity,
                                                               final String persistentVolumeReclaimPolicy,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPortworxVolume portworxVolume,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecQuobyte quobyte,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecRbd rbd,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecScaleIO scaleIO,
                                                               final String storageClassName,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecStorageos storageos,
                                                               final String volumeMode,
                                                               final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCinder getCinder() {
        return cinder;
    }

    public void setCinder(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCinder cinder) {
        this.cinder = cinder;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecClaimRef getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecClaimRef claimRef) {
        this.claimRef = claimRef;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCsi getCsi() {
        return csi;
    }

    public void setCsi(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecCsi csi) {
        this.csi = csi;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFc getFc() {
        return fc;
    }

    public void setFc(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFc fc) {
        this.fc = fc;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecFlocker flocker) {
        this.flocker = flocker;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecLocal getLocal() {
        return local;
    }

    public void setLocal(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecLocal local) {
        this.local = local;
    }

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNfs getNfs() {
        return nfs;
    }

    public void setNfs(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNfs nfs) {
        this.nfs = nfs;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecRbd getRbd() {
        return rbd;
    }

    public void setRbd(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecRbd rbd) {
        this.rbd = rbd;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecStorageos storageos) {
        this.storageos = storageos;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                capacity,
                cephfs,
                cinder,
                claimRef,
                csi,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                glusterfs,
                hostPath,
                iscsi,
                local,
                mountOptions,
                nfs,
                nodeAffinity,
                persistentVolumeReclaimPolicy,
                photonPersistentDisk,
                portworxVolume,
                quobyte,
                rbd,
                scaleIO,
                storageClassName,
                storageos,
                volumeMode,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpec)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpec __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(claimRef, __otherCasted.claimRef) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(local, __otherCasted.local) &&
            Objects.equals(mountOptions, __otherCasted.mountOptions) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(persistentVolumeReclaimPolicy, __otherCasted.persistentVolumeReclaimPolicy) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
