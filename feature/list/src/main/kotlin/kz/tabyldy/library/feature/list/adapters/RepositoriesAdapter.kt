package kz.tabyldy.library.feature.list.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kz.tabyldy.core.model.Repo
import kz.tabyldy.library.feature.list.databinding.RepositoryRowBinding
import kz.tabyldy.library.feature.list.utils.Language

class RepositoriesAdapter(val onClick: (Repo) -> Unit) : RecyclerView.Adapter<RepositoriesAdapter.MViewHolder>() {

    private val differ = AsyncListDiffer(this, DiffUtilCallBack())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RepositoryRowBinding.inflate(inflater, parent, false)
        return MViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MViewHolder, position: Int) {
        val repo = differ.currentList[position]
        val description = repo.description
        val language = repo.language
        val repoName = repo.name

        holder.itemBinding.root.setOnClickListener {
            onClick(repo)
        }

        holder.itemBinding.repoName.text = repoName

        if (description.isNullOrBlank()) {
            holder.itemBinding.description.visibility = View.GONE
        } else {
            holder.itemBinding.description.text = repo.description
            holder.itemBinding.description.visibility = View.VISIBLE
        }

        if (language.isNullOrBlank()) {
            holder.itemBinding.repoLanguage.visibility = View.GONE
        } else {
            holder.itemBinding.repoLanguage.visibility = View.VISIBLE
            val lang = Language.parseLanguage(language)
            val context = holder.itemBinding.root.context
            val color = ContextCompat.getColor(context, lang.color)
            holder.itemBinding.repoLanguage.setTextColor(color)
            holder.itemBinding.repoLanguage.text=language
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun setList(list: List<Repo>) {
        differ.submitList(list)
    }

    class MViewHolder(val itemBinding: RepositoryRowBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

    class DiffUtilCallBack : DiffUtil.ItemCallback<Repo>() {

        override fun areItemsTheSame(oldItem: Repo, newItem: Repo): Boolean =
            oldItem.javaClass == newItem.javaClass

        override fun areContentsTheSame(oldItem: Repo, newItem: Repo): Boolean = oldItem == newItem

    }
}