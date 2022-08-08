package io.yupiik.kubernetes.bindings.v1_15_9.v1alpha1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VolumeAttachmentSpecSourceInlineVolumeSpec {
    private List<String> accessModes;
    private VolumeAttachmentSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore;
    private VolumeAttachmentSpecSourceInlineVolumeSpecAzureDisk azureDisk;
    private VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile azureFile;
    private Map<String, String> capacity;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCephfs cephfs;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCinder cinder;
    private VolumeAttachmentSpecSourceInlineVolumeSpecClaimRef claimRef;
    private VolumeAttachmentSpecSourceInlineVolumeSpecCsi csi;
    private VolumeAttachmentSpecSourceInlineVolumeSpecFc fc;
    private VolumeAttachmentSpecSourceInlineVolumeSpecFlexVolume flexVolume;
    private VolumeAttachmentSpecSourceInlineVolumeSpecFlocker flocker;
    private VolumeAttachmentSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk;
    private VolumeAttachmentSpecSourceInlineVolumeSpecGlusterfs glusterfs;
    private VolumeAttachmentSpecSourceInlineVolumeSpecHostPath hostPath;
    private VolumeAttachmentSpecSourceInlineVolumeSpecIscsi iscsi;
    private VolumeAttachmentSpecSourceInlineVolumeSpecLocal local;
    private List<String> mountOptions;
    private VolumeAttachmentSpecSourceInlineVolumeSpecNfs nfs;
    private VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private VolumeAttachmentSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk;
    private VolumeAttachmentSpecSourceInlineVolumeSpecPortworxVolume portworxVolume;
    private VolumeAttachmentSpecSourceInlineVolumeSpecQuobyte quobyte;
    private VolumeAttachmentSpecSourceInlineVolumeSpecRbd rbd;
    private VolumeAttachmentSpecSourceInlineVolumeSpecScaleIO scaleIO;
    private String storageClassName;
    private VolumeAttachmentSpecSourceInlineVolumeSpecStorageos storageos;
    private String volumeMode;
    private VolumeAttachmentSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume;

    public VolumeAttachmentSpecSourceInlineVolumeSpec() {
        // no-op
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpec(final List<String> accessModes,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecAzureDisk azureDisk,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile azureFile,
                                                      final Map<String, String> capacity,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecCephfs cephfs,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecCinder cinder,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecClaimRef claimRef,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecCsi csi,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecFc fc,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecFlexVolume flexVolume,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecFlocker flocker,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecGlusterfs glusterfs,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecHostPath hostPath,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecIscsi iscsi,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecLocal local,
                                                      final List<String> mountOptions,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecNfs nfs,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity,
                                                      final String persistentVolumeReclaimPolicy,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecPortworxVolume portworxVolume,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecQuobyte quobyte,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecRbd rbd,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecScaleIO scaleIO,
                                                      final String storageClassName,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecStorageos storageos,
                                                      final String volumeMode,
                                                      final VolumeAttachmentSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final VolumeAttachmentSpecSourceInlineVolumeSpecAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final VolumeAttachmentSpecSourceInlineVolumeSpecAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final VolumeAttachmentSpecSourceInlineVolumeSpecAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final VolumeAttachmentSpecSourceInlineVolumeSpecCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCinder getCinder() {
        return cinder;
    }

    public void setCinder(final VolumeAttachmentSpecSourceInlineVolumeSpecCinder cinder) {
        this.cinder = cinder;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecClaimRef getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(final VolumeAttachmentSpecSourceInlineVolumeSpecClaimRef claimRef) {
        this.claimRef = claimRef;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecCsi getCsi() {
        return csi;
    }

    public void setCsi(final VolumeAttachmentSpecSourceInlineVolumeSpecCsi csi) {
        this.csi = csi;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecFc getFc() {
        return fc;
    }

    public void setFc(final VolumeAttachmentSpecSourceInlineVolumeSpecFc fc) {
        this.fc = fc;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final VolumeAttachmentSpecSourceInlineVolumeSpecFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final VolumeAttachmentSpecSourceInlineVolumeSpecFlocker flocker) {
        this.flocker = flocker;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final VolumeAttachmentSpecSourceInlineVolumeSpecGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final VolumeAttachmentSpecSourceInlineVolumeSpecGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final VolumeAttachmentSpecSourceInlineVolumeSpecHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final VolumeAttachmentSpecSourceInlineVolumeSpecIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecLocal getLocal() {
        return local;
    }

    public void setLocal(final VolumeAttachmentSpecSourceInlineVolumeSpecLocal local) {
        this.local = local;
    }

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNfs getNfs() {
        return nfs;
    }

    public void setNfs(final VolumeAttachmentSpecSourceInlineVolumeSpecNfs nfs) {
        this.nfs = nfs;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final VolumeAttachmentSpecSourceInlineVolumeSpecNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final VolumeAttachmentSpecSourceInlineVolumeSpecPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final VolumeAttachmentSpecSourceInlineVolumeSpecPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final VolumeAttachmentSpecSourceInlineVolumeSpecQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecRbd getRbd() {
        return rbd;
    }

    public void setRbd(final VolumeAttachmentSpecSourceInlineVolumeSpecRbd rbd) {
        this.rbd = rbd;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final VolumeAttachmentSpecSourceInlineVolumeSpecScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final VolumeAttachmentSpecSourceInlineVolumeSpecStorageos storageos) {
        this.storageos = storageos;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public VolumeAttachmentSpecSourceInlineVolumeSpecVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final VolumeAttachmentSpecSourceInlineVolumeSpecVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof VolumeAttachmentSpecSourceInlineVolumeSpec)) {
            return false;
        }
        final VolumeAttachmentSpecSourceInlineVolumeSpec __otherCasted = (VolumeAttachmentSpecSourceInlineVolumeSpec) __other;
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
