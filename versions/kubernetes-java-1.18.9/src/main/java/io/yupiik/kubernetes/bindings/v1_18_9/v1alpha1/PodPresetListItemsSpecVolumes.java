package io.yupiik.kubernetes.bindings.v1_18_9.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumes {
    private PodPresetListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodPresetListItemsSpecVolumesAzureDisk azureDisk;
    private PodPresetListItemsSpecVolumesAzureFile azureFile;
    private PodPresetListItemsSpecVolumesCephfs cephfs;
    private PodPresetListItemsSpecVolumesCinder cinder;
    private PodPresetListItemsSpecVolumesConfigMap configMap;
    private PodPresetListItemsSpecVolumesCsi csi;
    private PodPresetListItemsSpecVolumesDownwardAPI downwardAPI;
    private PodPresetListItemsSpecVolumesEmptyDir emptyDir;
    private PodPresetListItemsSpecVolumesFc fc;
    private PodPresetListItemsSpecVolumesFlexVolume flexVolume;
    private PodPresetListItemsSpecVolumesFlocker flocker;
    private PodPresetListItemsSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodPresetListItemsSpecVolumesGitRepo gitRepo;
    private PodPresetListItemsSpecVolumesGlusterfs glusterfs;
    private PodPresetListItemsSpecVolumesHostPath hostPath;
    private PodPresetListItemsSpecVolumesIscsi iscsi;
    private String name;
    private PodPresetListItemsSpecVolumesNfs nfs;
    private PodPresetListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodPresetListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodPresetListItemsSpecVolumesPortworxVolume portworxVolume;
    private PodPresetListItemsSpecVolumesProjected projected;
    private PodPresetListItemsSpecVolumesQuobyte quobyte;
    private PodPresetListItemsSpecVolumesRbd rbd;
    private PodPresetListItemsSpecVolumesScaleIO scaleIO;
    private PodPresetListItemsSpecVolumesSecret secret;
    private PodPresetListItemsSpecVolumesStorageos storageos;
    private PodPresetListItemsSpecVolumesVsphereVolume vsphereVolume;

    public PodPresetListItemsSpecVolumes() {
        // no-op
    }

    public PodPresetListItemsSpecVolumes(final PodPresetListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                         final PodPresetListItemsSpecVolumesAzureDisk azureDisk,
                                         final PodPresetListItemsSpecVolumesAzureFile azureFile,
                                         final PodPresetListItemsSpecVolumesCephfs cephfs,
                                         final PodPresetListItemsSpecVolumesCinder cinder,
                                         final PodPresetListItemsSpecVolumesConfigMap configMap,
                                         final PodPresetListItemsSpecVolumesCsi csi,
                                         final PodPresetListItemsSpecVolumesDownwardAPI downwardAPI,
                                         final PodPresetListItemsSpecVolumesEmptyDir emptyDir,
                                         final PodPresetListItemsSpecVolumesFc fc,
                                         final PodPresetListItemsSpecVolumesFlexVolume flexVolume,
                                         final PodPresetListItemsSpecVolumesFlocker flocker,
                                         final PodPresetListItemsSpecVolumesGcePersistentDisk gcePersistentDisk,
                                         final PodPresetListItemsSpecVolumesGitRepo gitRepo,
                                         final PodPresetListItemsSpecVolumesGlusterfs glusterfs,
                                         final PodPresetListItemsSpecVolumesHostPath hostPath,
                                         final PodPresetListItemsSpecVolumesIscsi iscsi,
                                         final String name,
                                         final PodPresetListItemsSpecVolumesNfs nfs,
                                         final PodPresetListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                         final PodPresetListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                         final PodPresetListItemsSpecVolumesPortworxVolume portworxVolume,
                                         final PodPresetListItemsSpecVolumesProjected projected,
                                         final PodPresetListItemsSpecVolumesQuobyte quobyte,
                                         final PodPresetListItemsSpecVolumesRbd rbd,
                                         final PodPresetListItemsSpecVolumesScaleIO scaleIO,
                                         final PodPresetListItemsSpecVolumesSecret secret,
                                         final PodPresetListItemsSpecVolumesStorageos storageos,
                                         final PodPresetListItemsSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodPresetListItemsSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodPresetListItemsSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodPresetListItemsSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodPresetListItemsSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodPresetListItemsSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodPresetListItemsSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodPresetListItemsSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodPresetListItemsSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodPresetListItemsSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodPresetListItemsSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodPresetListItemsSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodPresetListItemsSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodPresetListItemsSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodPresetListItemsSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodPresetListItemsSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodPresetListItemsSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodPresetListItemsSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodPresetListItemsSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodPresetListItemsSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodPresetListItemsSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodPresetListItemsSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodPresetListItemsSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodPresetListItemsSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodPresetListItemsSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodPresetListItemsSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodPresetListItemsSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodPresetListItemsSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodPresetListItemsSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodPresetListItemsSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodPresetListItemsSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodPresetListItemsSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodPresetListItemsSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodPresetListItemsSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodPresetListItemsSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodPresetListItemsSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodPresetListItemsSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodPresetListItemsSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodPresetListItemsSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodPresetListItemsSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodPresetListItemsSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodPresetListItemsSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodPresetListItemsSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodPresetListItemsSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodPresetListItemsSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodPresetListItemsSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodPresetListItemsSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodPresetListItemsSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodPresetListItemsSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodPresetListItemsSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodPresetListItemsSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodPresetListItemsSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodPresetListItemsSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodPresetListItemsSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodPresetListItemsSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodPresetListItemsSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodPresetListItemsSpecVolumesVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumes)) {
            return false;
        }
        final PodPresetListItemsSpecVolumes __otherCasted = (PodPresetListItemsSpecVolumes) __other;
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
