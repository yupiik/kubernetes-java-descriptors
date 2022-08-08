package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumes {
    private DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private DaemonSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private DaemonSetListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private DaemonSetListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private DaemonSetListItemsSpecTemplateSpecVolumesCinder cinder;
    private DaemonSetListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private DaemonSetListItemsSpecTemplateSpecVolumesCsi csi;
    private DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private DaemonSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private DaemonSetListItemsSpecTemplateSpecVolumesFc fc;
    private DaemonSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private DaemonSetListItemsSpecTemplateSpecVolumesFlocker flocker;
    private DaemonSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private DaemonSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private DaemonSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private DaemonSetListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private DaemonSetListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private DaemonSetListItemsSpecTemplateSpecVolumesNfs nfs;
    private DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private DaemonSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private DaemonSetListItemsSpecTemplateSpecVolumesProjected projected;
    private DaemonSetListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private DaemonSetListItemsSpecTemplateSpecVolumesRbd rbd;
    private DaemonSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private DaemonSetListItemsSpecTemplateSpecVolumesSecret secret;
    private DaemonSetListItemsSpecTemplateSpecVolumesStorageos storageos;
    private DaemonSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public DaemonSetListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumes(final DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesCinder cinder,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesCsi csi,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesFc fc,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesFlocker flocker,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                                     final String name,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesNfs nfs,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesProjected projected,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesRbd rbd,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesSecret secret,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesStorageos storageos,
                                                     final DaemonSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final DaemonSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final DaemonSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final DaemonSetListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final DaemonSetListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final DaemonSetListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DaemonSetListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final DaemonSetListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DaemonSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final DaemonSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final DaemonSetListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final DaemonSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final DaemonSetListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final DaemonSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final DaemonSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final DaemonSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final DaemonSetListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final DaemonSetListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final DaemonSetListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final DaemonSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final DaemonSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final DaemonSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final DaemonSetListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final DaemonSetListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final DaemonSetListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final DaemonSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DaemonSetListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final DaemonSetListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final DaemonSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumes __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumes) __other;
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
