package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.Objects;

public class PodListItemsSpecVolumes {
    private PodListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodListItemsSpecVolumesAzureDisk azureDisk;
    private PodListItemsSpecVolumesAzureFile azureFile;
    private PodListItemsSpecVolumesCephfs cephfs;
    private PodListItemsSpecVolumesCinder cinder;
    private PodListItemsSpecVolumesConfigMap configMap;
    private PodListItemsSpecVolumesCsi csi;
    private PodListItemsSpecVolumesDownwardAPI downwardAPI;
    private PodListItemsSpecVolumesEmptyDir emptyDir;
    private PodListItemsSpecVolumesFc fc;
    private PodListItemsSpecVolumesFlexVolume flexVolume;
    private PodListItemsSpecVolumesFlocker flocker;
    private PodListItemsSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodListItemsSpecVolumesGitRepo gitRepo;
    private PodListItemsSpecVolumesGlusterfs glusterfs;
    private PodListItemsSpecVolumesHostPath hostPath;
    private PodListItemsSpecVolumesIscsi iscsi;
    private String name;
    private PodListItemsSpecVolumesNfs nfs;
    private PodListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodListItemsSpecVolumesPortworxVolume portworxVolume;
    private PodListItemsSpecVolumesProjected projected;
    private PodListItemsSpecVolumesQuobyte quobyte;
    private PodListItemsSpecVolumesRbd rbd;
    private PodListItemsSpecVolumesScaleIO scaleIO;
    private PodListItemsSpecVolumesSecret secret;
    private PodListItemsSpecVolumesStorageos storageos;
    private PodListItemsSpecVolumesVsphereVolume vsphereVolume;

    public PodListItemsSpecVolumes() {
        // no-op
    }

    public PodListItemsSpecVolumes(final PodListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                   final PodListItemsSpecVolumesAzureDisk azureDisk,
                                   final PodListItemsSpecVolumesAzureFile azureFile,
                                   final PodListItemsSpecVolumesCephfs cephfs,
                                   final PodListItemsSpecVolumesCinder cinder,
                                   final PodListItemsSpecVolumesConfigMap configMap,
                                   final PodListItemsSpecVolumesCsi csi,
                                   final PodListItemsSpecVolumesDownwardAPI downwardAPI,
                                   final PodListItemsSpecVolumesEmptyDir emptyDir,
                                   final PodListItemsSpecVolumesFc fc,
                                   final PodListItemsSpecVolumesFlexVolume flexVolume,
                                   final PodListItemsSpecVolumesFlocker flocker,
                                   final PodListItemsSpecVolumesGcePersistentDisk gcePersistentDisk,
                                   final PodListItemsSpecVolumesGitRepo gitRepo,
                                   final PodListItemsSpecVolumesGlusterfs glusterfs,
                                   final PodListItemsSpecVolumesHostPath hostPath,
                                   final PodListItemsSpecVolumesIscsi iscsi,
                                   final String name,
                                   final PodListItemsSpecVolumesNfs nfs,
                                   final PodListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                   final PodListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                   final PodListItemsSpecVolumesPortworxVolume portworxVolume,
                                   final PodListItemsSpecVolumesProjected projected,
                                   final PodListItemsSpecVolumesQuobyte quobyte,
                                   final PodListItemsSpecVolumesRbd rbd,
                                   final PodListItemsSpecVolumesScaleIO scaleIO,
                                   final PodListItemsSpecVolumesSecret secret,
                                   final PodListItemsSpecVolumesStorageos storageos,
                                   final PodListItemsSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodListItemsSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodListItemsSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodListItemsSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodListItemsSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodListItemsSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodListItemsSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodListItemsSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodListItemsSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodListItemsSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodListItemsSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodListItemsSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodListItemsSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodListItemsSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodListItemsSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodListItemsSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodListItemsSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodListItemsSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodListItemsSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodListItemsSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodListItemsSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodListItemsSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodListItemsSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodListItemsSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodListItemsSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodListItemsSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodListItemsSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodListItemsSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodListItemsSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodListItemsSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodListItemsSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodListItemsSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodListItemsSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodListItemsSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodListItemsSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodListItemsSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodListItemsSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodListItemsSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodListItemsSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodListItemsSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodListItemsSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodListItemsSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodListItemsSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodListItemsSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodListItemsSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodListItemsSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodListItemsSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodListItemsSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodListItemsSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodListItemsSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodListItemsSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodListItemsSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodListItemsSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodListItemsSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumes)) {
            return false;
        }
        final PodListItemsSpecVolumes __otherCasted = (PodListItemsSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
